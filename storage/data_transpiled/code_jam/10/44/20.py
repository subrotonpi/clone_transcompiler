def _import ( ) :
    import math
    import os
    import os
    import os
    import os
    import math
    class GrazingGoogleGoats ( Template ) :
        def __init__ ( self , input_filename , output_filename ) :
            self.write ( "Grazing Google Goats Files" , input_filename , output_filename , use_output = True )
        def __init__ ( self ) :
            self.__init__ ( self )
        def distance ( x1 , y1 , x2 , y2 ) :
            return math.sqrt ( math.pow ( x1 - x2 , 2 ) + math.pow ( y1 - y2 , 2 ) )
        def algorithm ( self ) :
            answer = [ ]
            for i in range ( self.m ) :
                r0 = self.distance ( px [ 0 ] , py [ 0 ] , qx [ i ] , qy [ i ] )
                r1 = self.distance ( px [ 1 ] , py [ 1 ] , qx [ i ] , qy [ i ] )
                ab = self.distance ( px [ 0 ] , py [ 0 ] , px [ 1 ] , py [ 1 ] )
                c = ab
                cbd = 2 * math.acos ( ( r1 ** 2 + c ** 2 - r0 ** 2 ) / ( 2 * r1 ** 2 ) )
                cad = 2 * math.acos ( ( r0 ** 2 + c ** 2 - r1 ** 2 ) / ( 2 * r0 ** 2 ) )
                answer.append ( 0.5 * cbd * r1 ** 2 - 0.5 * r1 ** 2 * math.sin ( cbd ) + 0.5 * cad * r0 ** 2 - 0.5 * r0 ** 2 * math.sin ( cad ) )
        def read_input_file_one_case ( self ) :
            self.read_line_token ( )
            self.n , m = self.get_token_int ( )
            self.px = [ self.get_token_int ( ) for self in self.px ]
            self.py = [ self.get_token_int ( ) for self in self.py ]
            self.qx = [ self.get_token_int ( ) for self in self.qx ]
            self.qy = [ self.get_token_int ( ) for self in self.qy ]
    return GrazingGoogleGoats
