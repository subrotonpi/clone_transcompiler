def _import ( ) : return _import ( )
from os import open , isfile , isfile
from os import listdir , min , max , raw_input
from os.path import join
class ChargingChaos :
    def __init__ ( self ) :
        self.INPUT_FILE_NAME = 'A-large.in'
        self.OUTPUT_FILE_NAME = 'ChargingChaos.out'
    def __init__ ( self , * args ) :
        self.init = [ ]
        self.req = [ ]
    def get_req ( self ) :
        if len ( self.init [ 0 ] ) == 0 : return 'base'
        num_init_on = 0
        for i in range ( 0 , len ( self.init ) ) :
            if self.init [ i ] [ 0 ] == '1' :
                num_init_on += 1
        if self.init [ 0 ] [ 1 ] == '1' :
            num_req_on += 1
        return 'fail'
    def split ( self ) :
        self.init = iter ( self.init )
        self.req = iter ( self.req )
    def get_req ( self ) :
        if self.init [ 0 ] [ 0 ] == '1' :
            num_init_on = 0
            for i in range ( 1 , num_init_on + 1 ) :
                if self.init [ i ] [ 0 ] == '1' :
                    num_req_on += 1
            return self.init [ i ] [ 1 ]
        else :
            return 'fail'
    def get_req ( self ) :
        self.init = iter ( self.req )
        self.req = iter ( self.req )
        if ( self.req [ 0 ] [ 0 ] == '1' ) ^ self.req [ 0 ] [ 1 ] :
            num_req_on += 1
        return self.init [ 0 ] [ 1 ]
    def get_req ( self ) :
        self.init = iter ( self.req )
        self.req = iter ( self.req )
        self.req = iter ( self.req )
        self.req = iter ( self.req )
        self.req = iter ( self.req )
        return self.req [ 0 ] [ 1 ]
    def get_req ( self ) :
        self.init = iter ( self.req )
        return self