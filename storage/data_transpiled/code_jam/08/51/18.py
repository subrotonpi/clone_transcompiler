def import _import_pockets
class Pockets :
    def __init__ ( self , name , ** kwargs ) :
        self.name = name
        self.num_cases = len ( self.num_cases )
        for i in range ( self.num_cases ) :
            self.do_case ( i + 1 , self.num_cases )
    def do_case ( self , case_num , ** kwargs ) :
        L = len ( self.num_crosses )
        path = [ ]
        for i in range ( self.num_crosses ) :
            self.y_walls [ i ] = True
        for i in range ( self.num_crosses ) :
            self.num_crosses [ i ] = True
    def do_case ( self , case_num , ** kwargs ) :
        L = len ( self.num_crosses )
        path = [ ]
        for i in range ( self.num_crosses ) :
            self.pockets [ i ] = True
        for i in range ( self.num_crosses ) :
            self.num_crosses [ i ] = True
        if self.num_crosses [ i ] == 0 and self.num_crosses [ i ] % 2 :
            self.points [ i ] = True
    x , y = self.num_crosses , self.num_crosses
    dir = 'north'
    x_walls = [ ]
    num_x_walls = [ ]
    y_walls = [ ]
    num_y_walls = [ ]
    for c in path :
        if c == 'F' :
            if dir == 'north' :
                self.x_walls [ x ].append ( True )
                self.num_x_walls [ y ] += 1
                y += 1
            elif dir == 'east' :
                self.y_walls [ x ].append ( True )
                self.num_y_walls [ x ] += 1
                x += 1
            elif dir == 'south' :
                y -= 1
                self.x_walls [ x ].append ( True )
                self.num_x_walls [ y ] += 1
            elif dir == 'west' :
                x -= 1
                self.y_walls [ x ].append ( True )
    return
