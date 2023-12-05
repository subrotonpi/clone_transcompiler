def _import ( ) :
    from os import system , re
    class B ( object ) :
        def __init__ ( self , file_name ) :
            self.file_name = re.sub ( '_.*' , '' , file_name ).lower ( )
        def input_file_name ( self , file_name ) :
            self.file_name = file_name + '.in'
            self.output_file_name = file_name + '.out'
        def __init__ ( self , f ) :
            self.n = f.tell ( )
            self.x = [ ]
            self.y = [ ]
            for i in range ( 1 , self.n + 1 ) :
                self.p.append ( self.x [ i ] )
                self.p.append ( self.y [ i ] )
            self.mark = [ ]
            self.bestarea = self.bestarea
            self.bestp = self.p [ : ]
    for j in range ( 0 , self.n ) :
        if self.mark [ j ] :
            continue
        self.mark [ j ] = True
        self.p [ j ] = self.x [ j ] * self.y [ j ] - self.x [ j ] * self.y [ i ] + self.x [ k ] * self.y [ j ] - self.x [ i ] * self.y [ k ]
    def _between ( self , i , j , k ) :
        return ( self.x [ i ] <= self.x [ j ] and self.x [ j ] <= self.x [ k ] or self.x [ i ] >= self.x [ j ] and self.x [ j ] >= self.x [ k ] )
    def _search ( self , i , j , k ) :
        if self.i == n :
            for j in range ( 0 , self.n ) :
                for k in range ( 0 , self.n ) :
                    if self.j == k :
                        continue
                    o1 = self.o ( self.p [ k ] , self.p [ k + 1 ] , self.p [ j ] )
                    o2 = self.o ( self.p [ k ] , self.p [ j ] , self.p [ k + 1 ] )
                    if self.o3 * self.