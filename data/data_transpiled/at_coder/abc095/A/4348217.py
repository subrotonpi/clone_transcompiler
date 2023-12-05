def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.po = __main__.__doc__
    def __call__ ( self , po ) :
        p = po.split ( '' , 1 )
        count = 700
        for i in p :
            if i == 'o' :
                count += 100
        print ( count )
