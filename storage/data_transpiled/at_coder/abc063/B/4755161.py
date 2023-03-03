def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.set = set ( )
        a = sc.read ( ).decode ( 'utf-8' )
        for i in a :
            self.set.add ( i )
        if len ( self.set ) == len ( a ) :
            print ( 'yes' )
        else :
            print ( 'no' )
