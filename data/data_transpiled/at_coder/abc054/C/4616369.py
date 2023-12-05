def _import ( ) :
    from collections import defaultdict
    from collections import defaultdict
    from queue import Queue
    from scanner import Scanner
    class Main ( object ) :
        def __init__ ( self ) :
            sc = Scanner ( )
            N , M = map ( int , N )
            map = defaultdict ( int )
            flag = [ True ] * N
            for i in range ( M ) :
                a , b = map ( int , N ) - 1
                map [ a ] [ b ] = 1
                map [ b ] [ a ] = 1
            flag [ 0 ] = False
            self.walk ( 0 , 0 )
            print ( self.ans )
            sc.close ( )
        def walk ( self , pos , walked ) :
            for i in range ( self.N ) :
                if map [ pos ] [ i ] == 1 and flag [ i ] :
                    self.walked += 1
                    if self.walked == self.N - 1 :
                        self.ans += 1
                        return
                    flag [ i ] = False
                    self.walk ( i , walked )
                    self.walked -= 1
                    flag [ i ] = True
            return
