def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.q = deque ( )
            self.n = sc.__next__ ( )
            for i , a in enumerate ( sc ) :
                if i % 2 == 0 :
                    self.q.append ( a )
                else :
                    self.q.appendleft ( a )
            if n % 2 == 0 :
                while not self.q.empty ( ) :
                    print ( self.q.popleft ( ) , end = ' ' )
            else :
                while not self.q.empty ( ) :
                    print ( self.q.popleft ( ) , end = ' ' )
            print ( )
