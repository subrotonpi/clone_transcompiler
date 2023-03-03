def _import ( ) :
    import os
    import sys
    import os
    import os
    import os
    import sys
    class B :
        def __init__ ( self ) :
            self.TASK = 'b'
            self.IS_SOUT = False
            self.FILE_MASK = "%-small-attempt0"
        def solve ( self , x , y ) :
            for k in range ( 1 , 2000 ) :
                cur_sol = self.solve ( x , y , k )
                if cur_sol :
                    return cur_sol
            raise RuntimeError ( "=( for %s %s" % ( x , y ) )
        def price ( self , x , y ) :
            return abs ( x ) + abs ( y )
        def solve ( self , x , y , k ) :
            steps = [ ]
            for cur in range ( k , 1 , - 1 ) :
                cur_step = '0'
                cur_price = sys.maxint
                if cur_price > price ( x , y + cur ) :
                    cur_price = price ( x , y + cur )
                    cur_step = 'N'
                if cur_price > price ( x , y - cur ) :
                    cur_price = price ( x , y - cur )
                    cur_step = 'S'
                if cur > price ( x - cur , y ) :
                    cur_price = price ( x - cur , y )
                    cur_step = 'W'
                if cur > price ( x + cur , y ) :
                    cur_price = price ( x + cur , y )
                    cur_step = 'E'
                steps.append ( cur_step )
                if cur_step == 'N' :
                    y += cur
                if cur_step == 'S' :
                    y -= cur
                if cur_step == 'W' :
                    x -= cur
                if cur_step == 'E' :
                    x += cur
            if self.price ( x , y ) == 0 :
                return ''.join ( steps )
            else :
                return None
        def run_once ( self , input , output ) :
            x = - input.find ( 'x' )
            y = - input.find ( 'y' )
            output.write ( self.solve ( x , y ) )
    return B
