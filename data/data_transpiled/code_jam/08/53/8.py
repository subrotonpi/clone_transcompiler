def import _match_search
class C ( object ) :
    DXs = [ 1 , 1 , 1 , - 1 , - 1 , - 1 ]
    DYs = [ 1 , 0 , - 1 , 1 , 0 , - 1 ]
    def __init__ ( self , lsize , rsize ) :
        self.lsize = lsize
        self.rsize = rsize
    def run ( self ) :
        self.matchnum = 0
        self.lmatch = [ ]
        self.rmatch = [ ]
        for u in range ( self.lsize ) :
            self.rsearched = [ ]
            if self.search ( u ) :
                self.matchnum += 1
        def search ( u ) :
            for v in self.ladj [ u ] :
                if v < 0 : continue
                if self.rsearched [ v ] == - 1 or self.search ( v ) :
                    self.lmatch.append ( v )
                    self.rsearched.append ( u )
                    return True
            return False
        self.matchnum += 1
    def run ( self ) :
        self.matchnum += 1
        self.rmatch = [ ]
        self.rsearched = [ ]
        for u in range ( self.rsize ) :
            self.rsearched.append ( False )
    def run ( self ) :
        self.matchnum += 1
        self.lmatch = [ ]
        self.rmatch = [ ]
        self.rsearched = [ ]
        for u in range ( self.matchnum ) :
            self.matchnum += 1
    def search ( u ) :
        for v in self.ladj :
            if v < 0 : continue
            if self.rsearched [ v ] == - 1 or self.search ( v ) :
                self.lmatch.append ( v )
                self.rmatch.append ( u )
        return False
    def run ( self ) :
        self.matchnum += 1
        self.rsize = [ ]
        self.ladj = [ ]
        self.radj = [ ]
        self.matchnum += 1
