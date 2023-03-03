def import _main
class Main ( object ) :
    def __init__ ( self ) :
        Scanner = _main
        self.H = self.W
        self.W = self.W
    def __init__ ( self ) :
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                if self.fig1 [ i ] [ j ] == 1 :
                    self.fig2 [ i ] [ j ] = '#'
    self.flag = True
    for i in range ( self.H ) :
        for j in range ( self.W ) :
            self.fig1 [ i ] [ j ] = self.s [ i ] [ j ]
            self.fig2 [ i ] [ j ] = self.s [ i ] [ j ]
    else :
        self.flag = False
if self.flag :
    print ( 'possible' )
    for i in range ( self.H ) :
        for j in range ( self.W ) :
            self.fig1 [ i ] [ j ] = self.s [ i ] [ j ]
            self.fig2 [ i ] [ j ] = self.s [ i ] [ j ]
else :
    print ( 'impossible' )
for i in range ( self.H ) :
    for j in range ( self.W ) :
        for x in range ( - 1 , 1 ) :
            for y in range ( - 1 , 1 ) :
                if i + x < 0 or i + x >= self.H or j + y < 0 or j + y >= self.W :
                    continue
                if self.fig1 [ i ] [ j ] == '#' and self.fig1 [ i + x ] [ j + y ] == '.' :
                    self.num1 [ i ] [ j ] = 1
for i in range ( self.H ) :
    for j in range ( self.W ) :
        for x in range ( - 1 , 1 ) :
            for y in range ( - 1 , 1 ) :
                if i + x < 0 or i + x >= self.H or j + y < 0 or j + y >= self.W :
                INDENT