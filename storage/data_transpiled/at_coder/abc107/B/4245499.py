def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.masume = True
    def masume ( self ) :
        with open ( self.masume ) as f :
            height = self.height
            width = self.width
    def masume ( self ) :
        with open ( self.masume ) as f :
            for tate in range ( self.height ) :
                temp = f.read ( )
                temp_list = temp.split ( '' )
                for yoko in range ( self.width ) :
                    self.data [ tate ] [ yoko ] = temp_list [ yoko ]
    for tate in range ( self.height ) :
        self.data = hantei_yoko ( self.data , tate , self.height , self.width )
    for yoko in range ( self.height ) :
        self.data = hantei_tate ( self.data , yoko , self.height , self.width )
    for tate in range ( self.height ) :
        null_flag = True
        for yoko in range ( self.width ) :
            if self.data [ tate ] [ yoko ] == 'None' :
                pass
            else :
                print ( self.data [ tate ] [ yoko ] , end = '' )
                null_flag = False
        if null_flag != True :
            print ( )
def hantei_yoko ( self ) :
    hantei = True
    for yoko in range ( self.height ) :
        if self.data [ tate ] [ yoko ] == '.' :
            pass
        else :
            hantei = False
    if hantei == True :
        for yoko in range ( self.width ) :
            self.data [ tate ] [ yoko ] = 'None'
    return hantei
