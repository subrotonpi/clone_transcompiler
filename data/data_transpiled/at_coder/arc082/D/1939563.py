def import import sys , StringIO , getopt
class Main ( object ) :
    def __init__ ( self ) :
        sc = getopt
        self.out = StringIO ( )
    def next ( self ) :
        while not self.out or not self.out :
            try : self.out = StringIO ( )
            except getopt.error : pass
    def read ( self ) :
        return int ( self.out )
    def select ( self , x ) :
        return int ( self.out )
    def select ( self , x ) :
        return float ( self.out )
    def readline ( self ) :
        data = ''
        try : self.out = StringIO ( )
        except : pass
        return data
    d , e , f = [ ] , [ ] , [ ]
    d.append ( 0 )
    e.append ( 0 )
    f.append ( x )
    for i in range ( k ) :
        if i % 2 == 0 :
            d [ i + 1 ] = max ( 0 , d [ i ] - ( r [ i + 1 ] - r [ i ] ) )
            e [ i + 1 ] = e [ i ] - ( r [ i + 1 ] - r [ i ] )
            f [ i + 1 ] = max ( 0 , f [ i ] - ( r [ i + 1 ] - r [ i ] ) )
        else :
            d [ i + 1 ] = min ( x , d [ i ] + ( r [ i ] - r [ i ] ) )
            e [ i + 1 ] = e [ i ] + ( r [ i ] - r [ i ] )
            f [ i + 1 ] = min ( x , f [ i ] + ( r [ i ] - r [ i ] ) )
    q = select ( [ ] , [ ] , [ ] )
    cpos = 0
    for i in range ( q ) :
        t = next ( self )
        a = next ( self )
        while cpos < k + 1 and r [ cpos ] <= t : cpos += 1
        cpos -= 1
        dif = t - r [ cpos ]
        st = max ( d [ cpos ] , min ( f [ cpos ] , a + e [ cpos ] ) )
        if cpos % 2 == 0