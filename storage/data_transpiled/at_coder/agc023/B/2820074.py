def main ( args ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = Scanner ( )
    n = sc.nextInt ( )
    str = [ [ str ( i ) for i in range ( n ) ] for i in range ( n ) ]
    count = 0
    second_str = [ [ ] for i in range ( n ) ]
    for A in range ( n ) :
        for i in range ( n ) :
            for j in range ( n ) :
                second_str [ i ].append ( str [ ( i + A ) % n ] [ j ] )
        ans = True
        for i in range ( n ) :
            for j in range ( n ) :
                if not ( second_str [ i ] [ j ] == second_str [ j ] [ i ] ) :
                    ans = False
        if ans == True :
            count += n
    print ( count )
