def import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( 'input.txt' , 'r' ) as f :
            list = f.read ( ).split ( )
            a = list [ 0 ]
            b = list [ 1 ]
            max = int ( 0 )
            v = int ( '9' + a [ 1 ] + a [ 2 ] )
            max = max ( max , v - int ( b ) )
            v = int ( a [ 0 ] + '9' + a [ 2 ] )
            max = max ( max , v - int ( b ) )
            v = int ( '' + a [ 0 ] + a [ 1 ] + '9' )
            max = max ( max , v - int ( b ) )
            v = int ( '1' + b [ 1 ] + b [ 2 ] )
            max = max ( max , int ( a ) - v )
            v = int ( b [ 0 ] + '0' + b [ 2 ] )
            max = max ( max , int ( a ) - v )
            v = int ( '' + b [ 0 ] + b [ 1 ] + '0' )
            max = max ( max , int ( a ) - v )
            print ( max )
