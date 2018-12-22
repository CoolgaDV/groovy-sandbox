
class Bucket {

    Integer capacity

    Bucket plus(Bucket other) {
        return new Bucket(capacity: capacity + other.capacity)
    }

    String call() {
        "Capacity is $capacity"
    }

}

def bucket = new Bucket(capacity: 1) + new Bucket(capacity: 2)

assert bucket.capacity == 3
assert bucket() == 'Capacity is 3'