def _import ( ) :
    import os
    import locale
    import threading
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.file_name = re.sub ( '_.*' , '' , self.file_name )
            self.input_file_name = self.file_name + '.in'
            self.output_file_name = self.file_name + '.out'
        def open ( self , mode ) :
            self.file_name = self.file_name
            self.input_file_name = self.file_name
            self.output_file_name = self.file_name
        def solve ( self ) :
            n , k = self.input.shape
            a = [ [ ] for _ in range ( n ) ]
            for i in range ( n ) :
                for j in range ( k ) :
                    a [ i , j ] = self.input.read ( )
            e = [ False ] * n
            mark = [ False ] * n
            left = [ - 1 ] * n
            for i in range ( n ) :
                for j in range ( n ) :
                    e [ i ] [ j ] = True
                    for t in range ( k ) :
                        if a [ i ] [ t ] <= a [ j ] [ t ] :
                            e [ i ] [ j ] = False
                            break
            ans = 0
            for i in range ( n ) :
                mark [ i ] = False
                if dfs ( i ) :
                    ans += 1
            out.write ( n - ans )
        def dfs ( i ) :
            if i in mark :
                return False
            mark [ i ] = True
            for j in range ( len ( e [ i ] ) ) :
                if not e [ i ] :
                    continue
                if left [ j ] == - 1 :
                    left [ j ] = i
                    return True
                if dfs ( left [ j ] ) :
                    left [ j ] = i
                    return True
            return False
        def run ( self ) :
            tests = self.input.read ( )
            self.input.close ( )
            for t in range ( 1 , tests + 1 ) :
                out.write ( "Case #%d: " % t )
