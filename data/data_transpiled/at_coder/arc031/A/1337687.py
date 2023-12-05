def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.name = self.name
        self.ck1 = ""
        self.ck2 = ""
        kainame = self.name.split ( "" )
        for i in range ( len ( self.name ) ) :
            ck1 = self.name [ i ]
            ck2 = self.name [ - 1 - i ]
            if not ( ck1 == ck2 ) :
                self.name = self.name [ - 1 ]
        self.name = self.name
