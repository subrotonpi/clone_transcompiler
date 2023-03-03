def main ( ) :
    from pydot.core import readline
    class Main ( object ) :
        def __init__ ( self ) :
            self.C = 1
            return
        def A ( self ) :
            self.N = len ( self.A )
            self.B = len ( self.B )
            self.C = 1
            self.edge = [ ]
            for a in self.A :
                b = self.B - 1
                self.mat [ a ] [ b ] = 1
                self.edge.append ( a )
            self.count = 0
            for a in self.edge :
                b = self.edge [ a ] [ 1 ]
                self.edge [ a ] [ b ] = 0
                if not self.connect ( self , a , b ) :
                    self.count += 1
                self.edge [ a ] [ b ] = 1
        def calc8 ( self , cell , h , w ) :
            if self.cell [ h ] [ w ] == '#' :
                print ( '#' , end = '' )
            else :
                hs = ( h - 1 , h , h + 1 )
                ws = ( w - 1 , w , w + 1 )
                sum = 0
                for nh in hs :
                    for nw in ws :
                        if nh < len ( self.cell ) and nh >= 0 and nw >= 0 and nw < len ( self.cell [ 0 ] ) :
                            if self.cell [ nh ] [ nw ] == '#' :
                                sum += 1
                print ( sum , end = '' )
            if w == len ( self.cell ) - 1 :
                print ( '' )
        def B ( self ) :
            self.H = len ( self.H )
            self.W = len ( self.cell )
            self.cell = [ ]
            for s in self.cell :
                for j in range ( W ) :
                    self.cell [ s ] [ j ] = 1
            for i in range ( H ) :
                for j in range ( W ) :
                    self.calc8 ( self , i , j )
    return Main
