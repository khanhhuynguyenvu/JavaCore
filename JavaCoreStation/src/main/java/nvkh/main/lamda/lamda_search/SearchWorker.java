package nvkh.main.lamda.lamda_search;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SearchWorker {
    public static void main(String[] args) {
        Worker w1 = new Worker("Bob",18,"Male");
        Worker w2 = new Worker("Jack",22,"Male");
        Worker w3 = new Worker("Andy",21,"Female");
        Worker w4 = new Worker("Mandy",32,"Male");
        Worker w5 = new Worker("Suzy",19,"Female");

        List<Worker> lw = Arrays.asList(w1,w2,w3,w4,w5);
        //Search with different criteria
        System.out.println("Print with condition 1:");
        printWorker(lw,
                (worker)-> worker.getSex().equals("Male")
                                && worker.getAge()>=18
                                    && worker.getAge()<=25
                );
        System.out.println("Print with condition 2:");
        printWorker(lw,
                (worker)-> worker.getSex().equals("Female")
                );
        System.out.println("Print with condition 1 but different approach: ");
        //Print all worker name with sex equal male
        processElement(
                lw,
                worker->worker.getSex().equals("Male")
                && worker.getAge()>=18
                && worker.getAge()<=25,
                worker -> worker,
                System.out::println
                );
        //lamda expression  as parameter
        System.out.println("Print with condition 1 but lamda expression parameter approach: ");
        //Print name
        lw.stream().filter(
                w-> w.getSex().equals("Male")
                        && w.getAge()>=18
                        && w.getAge()<=40)
                .map(w-> Arrays.asList(w.getName(),w.getAge(),w.getSex()))
                .forEach(System.out::println);
        System.out.println("Print with condition 1 but lamda expression parameter approach to List: ");
        //Stream to List
        List<String> filterWorkers =  lw.stream().filter(
                w-> w.getSex().equals("Male")
                        && w.getAge()>=18
                        && w.getAge()<=40)
                .map(Worker::getName)
                .collect(Collectors.toList());
        System.out.println(filterWorkers.toString());
    }
    public static void printWorker(List<Worker> workers,Filter<Worker> filter){
        for(Worker worker:workers){
            if (filter.compute(worker)){
                System.out.println(worker);
            }
        }
    }
    public static <X,Y> void processElement(Iterable<X> source,
                                            Filter<X> filter,
                                            Function<X,Y> mapper,
                                            Consumer<Y> block){
        for(X o:source){
            if(filter.compute(o)){
                Y data = mapper.apply(o);
                block.accept(data);
            }
        }
    }
}
