def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            with open ( 'input.txt' , 'r' ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    s = cin.read ( )
                    print ( 'Case #%d: %s' % ( C , solve ( s ) ) )
        def solve ( s ) :
            if int ( s ) == 0 :
                return 0
            N = len ( s )
            head , tail = s [ : N // 2 ] , s [ N // 2 : ]
            tmp = int ( tail )
            if tmp == 0 :
                return 1 + solve ( '%d' % ( int ( s ) - 1 ) )
            next = '%d' % ( int ( s ) - ( tmp - 1 ) )
            rev = rev ( next )
            if int ( next ) == int ( rev ) :
                return tmp + solve ( '%d' % ( int ( s ) - tmp ) )
            return tmp + solve ( rev )
        def rev ( s ) :
            return ( u'%s' % s ).reverse ( )
    return Main ( )
