def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 = math.sin ( self.x1 )
            self.x2 = math.sin ( self.x2 )
            self.y1 = math.sin ( self.y1 )
            self.y2 = math.sin ( self.y2 )
            self.z1 = math.sin ( self.z1 )
            self.z2 = math.cos ( self.z2 )
            y1 = y1 - x1
            z1 = z1 - x1
            y2 = y2 - x2
            z2 = z2 - x2
            a = abs ( y1 * z2 - y2 * z1 )
            s = a / 2.0
            print ( '%.1f' % s )
