def _ _ main _ _ ( ) :
    import locale
    import re
    import locale
    import os
    import sys
    class C :
        def __init__ ( self ) :
            self.file_name = os.path.basename ( self.file_name ).replace ( '_.*' , '' )
        def __init__ ( self , input_file_name , output_file_name ) :
            self.file_name = os.path.basename ( input_file_name )
            self.file_name = os.path.basename ( output_file_name )
            self.tests = [ ]
            self.x = self.start
            self.my_x = 4 * self.x
            if not self.start :
                self.my_x += 2
        def get ( self , x ) :
            self.x = x
            self.start = self.my_x
            self.my_x = 4 * self.x
            if not self.start :
                self.my_x += 2
        def get ( self , x ) :
            self.my_x = 4 * self.x + 3
        def get ( self , x ) :
            self.my_x = 4 * self.x
            return self.my_x - self.my_x
        def get ( self , x ) :
            return self.x + ( self.start and self.my_x )
        def solve ( self ) :
            r = self.r
            d = defaultdict ( lambda : [ ] )
            for x1 , y1 , x2 , y2 in d :
                for y in range ( y1 , y2 + 1 ) :
                    if y not in d :
                        d [ y ] = [ ]
                    d [ y ].append ( ( x1 , True ) )
                    d [ y ].append ( ( x2 + 1 , False ) )
            for y in d :
                yield y
            t = 0
            while y not in d :
                for x in d [ y ] :
                    d [ y ].sort ( )
                    new_list = [ ]
                    open = 0
                    for s in d [ y ] :
                        if s.start :
                            open += 1
                            if open == 1 :
                                new_list.append ( s )
                        else :
                            open -= 1
                            if open == 0 :
                                new_list.append ( s )
                d [ y ]