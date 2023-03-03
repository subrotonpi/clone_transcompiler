def main ( ) :
    import sys
    from itertools import repeat
    for a , b , n in repeat ( range ( 10 ) , repeat ( range ( 10 ) ) ) :
        for i in repeat ( range ( n ) , repeat ( range ( 10 ) ) ) :
            if i % a == 0 and i % b == 0 :
                print ( i )
                break
