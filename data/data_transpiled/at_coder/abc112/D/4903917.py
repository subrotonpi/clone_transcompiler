def main ( ) :
    import math
    import Queue
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.q = Queue ( )
        def Divisor ( M ) :
            for i in range ( 1 , math.sqrt ( M ) ) :
                if M % i != 0 :
                    continue
                self.q.put ( i )
                self.q.put ( M // i )
            if M % math.sqrt ( M ) == 0 :
                self.q.put ( int ( math.sqrt ( M ) ) )
        def main ( self ) :
            try :
                with open ( "/proc/" , "r" ) as sc :
                    N = sc.read ( )
                    M = sc.read ( )
                    Divisor ( M )
                self.max = 0
                while not self.q.empty ( ) :
                    s = self.q.pop ( )
                    if M % s == 0 and M / s >= N :
                        self.max = max ( self.max , s )
                print ( self.max )
