package com.company;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println();
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println();
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int bucketCount = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            bucketCount = -1;
        } else {
            bucketCount = (int) Math.ceil((width * height) / areaPerBucket) - extraBuckets;
        }
        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int bucketCount = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            bucketCount = -1;
        } else {
            bucketCount = (int) Math.ceil((width * height) / areaPerBucket);
        }
        return bucketCount;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        int bucketCount = 0;
        if (area <= 0 || areaPerBucket <= 0 ){
            bucketCount = -1;
        } else {
            bucketCount = (int) Math.ceil(area / areaPerBucket);
        }
        return bucketCount;
    }
}
