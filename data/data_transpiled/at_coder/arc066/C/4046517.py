def import sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( string.ascii_letters )
        self.dp = [ ]
        a0 = sys.stdin.read ( 1 )
        self.dp.append ( [ a0 , int ( math.floor ( a0 ) / 10 ) , int ( math.floor ( a0 ) / 10 ) ] )
        for str , v in string.ascii_letters.digits :
            if str == '+' :
                self.dp [ 0 ].append ( max ( max ( self.dp [ - 1 ] [ 0 ] + v , self.dp [ - 1 ] [ 1 ] + v ) , self.dp [ - 1 ] [ 2 ] + v ) )
                self.dp [ 1 ].append ( max ( self.dp [ - 1 ] [ 1 ] - v , self.dp [ - 1 ] [ 2 ] + v ) )
                self.dp [ 2 ].append ( self.dp [ - 1 ] [ 2 ] + v )
            else :
                self.dp [ 0 ].append ( max ( self.dp [ - 1 ] [ 0 ] - v , self.dp [ - 1 ] [ 1 ] + v ) )
                self.dp [ 1 ].append ( max ( self.dp [ - 1 ] [ 0 ] - v , self.dp [ - 1 ] [ 1 ] + v ) )
                self.dp [ 2 ].append ( max ( self.dp [ - 1 ] [ 1 ] - v , self.dp [ - 1 ] [ 2 ] + v ) )
        print ( self.dp [ - 1 ] [ 0 ] )
