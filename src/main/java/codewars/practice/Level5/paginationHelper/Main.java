package codewars.practice.Level5.paginationHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //PaginationHelper<?> paginationHelper = new PaginationHelper<>(List.of(), 4);
        //PaginationHelper<Character> paginationHelper = new PaginationHelper<>(Arrays.asList('a','b', 'c', 'd', 'e', 'f'), 4);
        PaginationHelper<Integer> paginationHelper = new PaginationHelper<>(List.of(1,2,3,4), 4);


        System.out.println("Page count: " + paginationHelper.pageCount());
        System.out.println("Item count:" + paginationHelper.itemCount());
        System.out.println("PageItem Count: " + paginationHelper.pageItemCount(0));
        System.out.println("PageItem Count: " +paginationHelper.pageItemCount(1));
        System.out.println("PageItem Count: " +paginationHelper.pageItemCount(2));
        System.out.println();
        System.out.println("Page index: " + paginationHelper.pageIndex(4));
        System.out.println("Page index: "+paginationHelper.pageIndex(2));
        System.out.println("Page index: "+paginationHelper.pageIndex(20));
        System.out.println("Page index: "+paginationHelper.pageIndex(-10));
    }
}
