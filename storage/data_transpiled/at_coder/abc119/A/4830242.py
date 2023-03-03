def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
    s = sys.stdin.read ( )
    line = s.split ( '/' , 4 )
    num = [ int ( i ) for i in line [ : 3 ] ]
    if num [ 0 ] < 2019 :
        print ( 'Heisei' )
    elif num [ 1 ] < 5 :
        print ( 'Heisei' )
    else :
        print ( 'TBD' )
