def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.a = [ ]
        self.b = [ False ] * ( n + 1 )
    def f ( ) :
        self.a.append ( sys.stdin.read ( ) )
    i , count = 1 , 0
    while True :
        if i == 2 :
            print ( count )
            break
        if self.b [ i ] :
            print ( - 1 )
            break
        self.b [ i ] = True
        i = self.a [ i ]
        count += 1
