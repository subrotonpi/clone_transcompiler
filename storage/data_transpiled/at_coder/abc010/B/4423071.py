def main ( args ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    n = sc.nextInt ( )
    hana = [ sc.next ( ) for i in range ( n ) ]
    count = 0
    for i in range ( n ) :
        m = hana [ i ]
        if m % 6 == 0 :
            count += 3
        if m % 6 == 2 :
            count += 1
        if m % 6 == 4 :
            count += 1
        if m % 6 == 5 :
            count += 2
    print ( count )
