def main ( ) :
    import sys
    import random
    import time
    from itertools import chain
    from itertools import chain
    def main ( ) :
        sc = random.choice ( range ( n ) )
        n = sum ( [ a for a in range ( d ) ] )
        a = sum ( [ a for a in range ( n ) ] )
        b = sum ( [ a for a in range ( n ) ] )
        m = sum ( [ a for a in range ( n ) ] )
        x = [ ]
        y = [ ]
        gragh = [ [ ] for _ in range ( n ) ]
        for i in range ( m ) :
            for j in range ( n ) :
                if i != j :
                    gragh [ i ].append ( 1000 )
        for i in range ( m ) :
            x.append ( sc.randint ( 1 , n ) )
            y.append ( sc.randint ( 1 , n ) )
            gragh [ x ].append ( gragh [ y ].append ( x ) )
        for k in range ( n ) :
            for i in range ( n ) :
                for j in range ( n ) :
                    gragh [ i ].append ( min ( gragh [ i ].get ( j , 0 ) , gragh [ i ].get ( k , 0 ) + gragh [ k ].get ( j , 0 ) ) )
        dag = [ ]
        for i in range ( m ) :
            if dist not in dag :
                list = chain ( [ i ] , [ ] )
                dag [ x ].append ( y )
            else :
                list = dag [ dist ]
                list.append ( x )
                dag [ y ].append ( y )
    return main ( )
