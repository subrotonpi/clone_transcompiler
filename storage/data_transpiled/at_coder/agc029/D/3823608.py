def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.H = 200000 + 11
        self.W = 200000 + 11
    def heights ( self ) :
        with open ( "/proc/self/" , "r" ) as sc :
            h , w , n = sc.read ( ).split ( " " )
            for i in range ( w ) :
                if i >= len ( self.heights ) :
                    self.heights.append ( sorted ( self.heights [ i ] ) )
                else :
                    self.heights [ i ] = [ ]
                self.heights [ i ].append ( h )
            for i in range ( n ) :
                h_i , w_i = sc.read ( ).split ( " " )
                h_i -= 1
                w_i -= 1
                self.heights [ w_i ].append ( h_i )
    current_h , current_w = 0 , 0
    ans = self.h
    while current_h < h and current_w < w :
        hh = self.heights [ current_w ].higher ( current_h )
        ans = min ( ans , hh )
        current_h += 1
        if current_h in self.heights [ current_w ] :
            break
        if current_w + 1 >= w :
            break
        if current_h not in self.heights [ current_w + 1 ] :
            current_w += 1
    print ( ans )
