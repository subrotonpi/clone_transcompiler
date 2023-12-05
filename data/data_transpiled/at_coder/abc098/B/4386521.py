def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.po = self.po
        self.count = 0
        for i in range ( 1 , len ( self.po ) ) :
            nm = 0
            a , b = self.po [ : i ]
            m = { }
            for j in a :
                m [ j ] = 1
            for j in b :
                if m [ j ] :
                    nm += 1
                    m [ j ] = None
            self.count = max ( self.count , nm )
        print ( self.count )
