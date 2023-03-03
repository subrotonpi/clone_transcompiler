def main ( ) :
    import sys
    from itertools import repeat
    for a , b , n in repeat ( range ( n ) , repeat ( range ( n ) ) ) :
        if i % a == 0 and i % b == 0 :
            print ( i )
            return
