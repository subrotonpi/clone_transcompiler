def cn.pyds.GoogleCodeJam ( ) :
    import math
    import os
    import sys
    class TicTacToeTomek ( object ) :
        def __init__ ( self ) :
            self.r = [ ]
            self.d = [ ]
            self.count = 0
            self.count1 = 0
            self.bit = 0
            self.s = 0
            self.t = 2
        def main ( self ) :
            self.r.append ( '1' )
            self.r.append ( '2' )
            self.count = 2
            k = 25
            while k > 0 :
                for i in range ( self.s , self.t ) :
                    if self.r [ i ].startswith ( '2' ) :
                        self.r.append ( self.r [ i ] + '0' )
                        self.count += 1
                        self.r.append ( self.r [ i ] + '1' )
                        self.count += 1
                        break
                    if self.r [ i ].endswith ( '2' ) :
                        continue
                    t1 = self.countt ( self.r [ i ] )
                    self.r.append ( self.r [ i ] + '0' )
                    self.count += 1
                    if t1 < 5 :
                        self.r.append ( self.r [ i ] + '1' )
                        self.count += 1
                    if self.r [ i ].startswith ( '2' ) is False :
                        self.r.append ( self.r [ i ] + '2' )
                        self.count += 1
                    self.s = self.t
                    self.t = self.count
                    k -= 1
            self.d.append ( '1' )
            self.d.append ( '4' )
            self.d.append ( '9' )
            self.d.append ( '121' )
            self.d.append ( '484' )
            self.count1 = 5
    return TicTacToeTomek
