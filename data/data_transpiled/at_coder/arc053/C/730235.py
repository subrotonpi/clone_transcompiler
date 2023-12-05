def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import get_distribution
    from numpy.core import get_distribution
    from numpy.core import get_distribution
    n = get_distribution ( ).count ( )
    magics = [ ]
    for i in range ( n ) :
        a = get_distribution ( ).get ( 'a' )
        b = get_distribution ( ).get ( 'b' )
        magics.append ( ( a , b ) )
    magics.sort ( )
    c = max = 0
    for m in magics :
        max = max ( max , c + m.up )
        c += m.diff
    print ( max )
    class Magic ( object ) :
        def __init__ ( self , up , down ) :
            self.up = up
            self.down = down
            self.diff = up - down
            self.diff_dir = 0
            if self.diff > 0 :
                self.diff_dir = 1
            elif self.diff < 0 :
                self.diff_dir = - 1
        def compare ( self , other ) :
            m = self.diff
            ddc = cmp ( self.diff_dir , m.diff_dir )
            if ddc != 0 :
                return ddc
            if self.diff_dir > 0 :
                return - cmp ( self.down , m.down )
            return cmp ( self.up , m.up )
    return Magic
