def _import ( ) :
    import os
    import locale
    import os
    import sys
    class C :
        def __init__ ( self ) :
            self.file_name = re.sub ( '_.*' , '' , self.file_name )
            self.input_file_name = self.file_name + '.in'
            self.output_file_name = self.file_name + '.out'
        def open ( self , mode ) :
            self.stdout = open ( self.output_file_name , mode )
            self.stdout.write ( self.answer )
    def solve ( ) :
        hei = sys.maxsize
        wid = sys.maxsize
        a = [ [ False for i in range ( hei ) ] for j in range ( 1 , wid / 4 ) ]
        used = [ [ True for i in range ( hei ) ] for j in range ( wid ) ]
        ok = [ [ False for i in range ( hei ) ] for j in range ( wid ) ]
        for i in range ( hei - 1 , - 1 , - 1 ) :
            s = sys.stdin.readline ( )
            for j in range ( wid - 1 , - 1 , - 1 ) :
                t = int ( s [ j ] , 16 )
                for k in range ( 4 ) :
                    a [ i ] [ 4 * j + k ] = ( t & ( 1 << ( 3 - k ) ) ) > 0
        for i in range ( hei - 1 , - 1 , - 1 ) :
            for j in range ( wid - 1 , - 1 , - 1 ) :
                if i + 1 == hei or j + 1 == wid :
                    continue
                if ( a [ i ] [ j + 1 ] != a [ i ] [ j ] and a [ i + 1 ] [ j + 1 ] == a [ i ] [ j ] ) :
                    ok.append ( [ True for i in range ( hei ) ] )
    max = [ 0 for i in range ( hei ) ]
    ans = 0
    answer = [ ]
    for size in range ( min ( hei , wid ) ) :
        for i in range ( hei - 1 , - 1 , - 1 ) :
            for j in range ( wid - 1 , - 1 , - 1 ) :
            INDENT