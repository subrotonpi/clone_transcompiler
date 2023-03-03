def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sieve = [ ]
        with open ( 'test.txt' , 'r' ) as sc :
            N = sc.read ( )
    def sieve ( self ) :
        for i in range ( N ) :
            if i != 0 :
                yield i
        print ( ' '.join ( [ str ( i ) for i in self.sieve ] ) )
    def sieve ( self ) :
        for i in range ( 2 , len ( self.sieve ) ) :
            if not self.sieve [ i ] :
                if i % 5 == 3 :
                    self.sieve.append ( i )
                for j in range ( 2 , len ( self.sieve ) ) :
                    self.sieve [ i * j ] = True
