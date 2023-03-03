def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        q = deque ( )
        n = sc.randint ( 1 , 10000 )
        a = [ sc.randint ( 1 , 10000 ) for i in range ( n ) ]
        if n % 2 == 0 :
            for i in range ( n ) :
                if i % 2 == 1 :
                    q.appendleft ( a [ i ] )
                else :
                    q.appendleft ( a [ i ] )
        else :
            for i in range ( n ) :
                if i % 2 == 1 :
                    q.appendleft ( a [ i ] )
                else :
                    q.appendleft ( a [ i ] )
        while not q.empty ( ) :
            sys.stdout.write ( q.pop ( ) )
            sys.stdout.write ( " " )
        sys.stdout.write ( "\n" )
