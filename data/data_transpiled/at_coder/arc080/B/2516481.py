def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w , self.n = sys.stdin.read ( ).decode ( 'utf-8' ).split ( ' ' )
        self.p = 0
        all = [ ]
        for i in range ( 1 , self.n + 1 ) :
            a = sys.stdin.read ( ).decode ( 'utf-8' ).split ( ' ' )
            for j in a :
                all.append ( '%d' % i )
        self.p = 0
        for i in range ( self.h ) :
            c = [ ]
            if i % 2 == 0 :
                for j in range ( self.w ) :
                    c.append ( all [ p ] )
            else :
                for j in range ( self.w - 1 , - 1 , - 1 ) :
                    c.append ( all [ p ] )
            print ( ' '.join ( c ) )
    def main ( self ) :
        with open ( '/proc/self/main.txt' , 'r' ) as sc :
            eval ( sc )
