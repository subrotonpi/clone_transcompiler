def main ( ) :
    import sys
    from random import randint
    start = randint ( 1 , 10 )
    goal = randint ( 1 , 5 )
    count = 0
    while start != goal :
        if start < goal :
            count += 1
            test_a = start + 10
            test_b = start + 5
            test_c = start + 1
            lst = [ test_a , test_b , test_c ]
            start = min ( lst , key = lambda x : abs ( x - goal ) ) [ 0 ]
        elif start > goal :
            count += 1
            test_a = start - 10
            test_b = start - 5
            test_c = start - 1
            lst = [ test_a , test_b , test_c ]
            start = min ( lst , key = lambda x : abs ( x - goal ) ) [ 0 ]
    print ( count )
