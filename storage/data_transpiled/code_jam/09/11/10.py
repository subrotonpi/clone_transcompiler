def _ ( ) :
    import sys
    import struct
    import string
    import string
    import set
    class A ( object ) :
        def __init__ ( self , base ) :
            self.yes = [ ]
            self.no = [ ]
        def doit ( self , x , base ) :
            self.yes.append ( x )
            self.no.append ( base )
        def doit ( self , base ) :
            self.yes.append ( base )
            self.no.append ( base )
    def doit ( self , x , base ) :
        self.yes.append ( x )
        self.no.append ( base )
    def doit ( self , x , base ) :
        self.yes.append ( x )
        self.no.append ( base )
    def doit ( self , x , base ) :
        self.no.append ( x )
    num = string.atoi ( x , base )
    while 1 :
        fnum = 0
        for char in num :
            fnum += ord ( char ) * ord ( base )
        if fnum in self.no or ( fnum in self.no ) :
            for nn in self.no :
                self.no [ nn ] |= ( 1 << base )
            return False
        if fnum == 1 or ( fnum in self.yes ) :
            for nn in self.yes :
                self.yes [ nn ] |= ( 1 << base )
            return True
        self.yes.append ( fnum )
        num = string.atoi ( fnum , base )
    def main ( ) :
        sc = string.split ( "\n" )
        e , T , tmp = sc.split ( " " )
        self.T = int ( tmp )
        mini = [ ]
        for x in range ( 2 , 11814585 + 1 ) :
            pos = 0
            for b in range ( 2 , 10 + 1 ) :
                if doit ( self , x , b ) :
                    pos += ( 1 << b )
            if not mini :
                mini.append ( x )
            if x % 100 == 0 :
                print ( "pre done\n" )
    return A
