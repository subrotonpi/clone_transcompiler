def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.c = ''
        self.to = [ ]
        self.v = False
        self.visit = False
        self.top = False
    def solve ( self ) :
        self.to = [ ]
        self.use = True
        self.visit = False
        self.v = False
        self.top = False
    def sn ( self ) :
        self.to = [ ]
        self.use = True
        self.visit = True
        self.v = False
        self.top = False
    def check_int ( c ) :
        if c in ( '0' , '1' , '2' , '3' , '4' , '7' , '8' , '9' ) :
            return True
        else :
            return False
    def solve ( self ) :
        for i in range ( 26 ) :
            n = Node ( )
            n.c = ord ( 'A' ) + i
            self.alpha.append ( n )
    for i in range ( N ) :
        c1 = s1 [ i ]
        c2 = s2 [ i ]
        if not check_int ( c1 ) and not check_int ( c2 ) :
            if c1 == c2 :
                ind = ord ( c1 ) - ord ( 'A' )
                self.alpha [ ind ].use = True
                if i == 0 :
                    self.alpha [ ind ].top = True
            else :
                ind = ord ( c1 ) - ord ( 'A' )
                ind2 = ord ( c2 ) - ord ( 'A' )
                self.alpha [ ind ].use = True
                self.alpha [ ind2 ].use = True
                self.alpha [ ind ].to.append ( c2 )
                self.alpha [ ind2 ].to.append ( c1 )
                if i == 0 :
                    self.alpha [ ind ].top = True
                    self.alpha [ ind2 ].top = True
        elif not check_int ( c1 ) and check_int ( c2 ) :
            ind = ord ( c1 ) - ord ( 'A' )
            self.alpha [ ind ].use = True
            self.alpha [ ind ].v = True
        elif not check_int ( c1 ) and not check_int ( c2 ) :
            self.alpha [ ind2 ]