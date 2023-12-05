def main ( ) :
    import sys
    for s in sys.stdin :
        t = s.split ( ' ' )
        ansa = - 1
        ansb = - 1
        for i in range ( len ( t ) ) :
            if i < len ( t ) - 1 :
                if t [ i ] == t [ i + 1 ] :
                    ansa = i + 1
                    ansb = i + 2
            if i < len ( t ) - 2 :
                if t [ i ] == t [ i + 1 ] or t [ i ] == t [ i + 2 ] or t [ i + 1 ] == t [ i + 2 ] :
                    ansa = i + 1
                    ansb = i + 3
        print ( ansa , ansb )
