def main ( ) :
    import sys
    import random
    import deque
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = sc.randint ( 1 , 10000 )
            c = sc.randint ( 1 , 10000 )
            k = sc.randint ( 1 , 10000 )
            t = [ ]
            intbv ( 0 )
            t.extend ( [ sc.randint ( 1 , 10000 ) ] )
            t.sort ( )
            queue = deque ( t )
            count = 0
            while len ( queue ) != 0 :
                count += 1
                target = queue.popleft ( )
                rider = 1
                while len ( queue ) != 0 and queue.popleft ( ) <= target + k and rider < c :
                    rider += 1
                    queue.popleft ( )
            print ( count )
