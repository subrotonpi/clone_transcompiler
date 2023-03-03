def _import ( ) :
    from collections import defaultdict
    from os import getenv
    class Main ( object ) :
        def __init__ ( self ) :
            self.UF1par = [ ]
            self.UF2par = [ ]
            self.UF2rank = [ ]
        def find_2 ( self , p ) :
            self.UF2rank [ p ] = p
            self.UF2rank [ q ] += 1
            return self.UF2rank [ p ]
        def find_3 ( self , q ) :
            self.UF2rank [ p ] = q
            return self.UF2rank [ q ]
        def find_4 ( self , p ) :
            if self.UF2rank [ p ] < self.UF2rank [ q ] :
                self.UF2rank [ p ] = self.UF2rank [ q ]
            else :
                self.UF2rank [ p ] += 1
        def find_4 ( self , q ) :
            if self.UF2rank [ p ] == self.UF2rank [ q ] :
                self.UF2rank [ p ] = self.UF2rank [ q ]
            else :
                self.UF2rank [ p ] = self.UF2rank [ q ]
        def find_4 ( self , q ) :
            if self.UF2rank [ p ] < self.UF2rank [ q ] :
                self.UF2rank [ p ] = self.UF2rank [ q ]
            else :
                self.UF2rank [ p ] = self.UF2rank [ q ]
        def find_4 ( self , q ) :
            self.UF2rank [ p ] = self.UF2rank [ q ]
            return self.UF2rank [ p ]
        def find_5 ( self , q ) :
            self.UF2rank [ p ] = self.UF2rank [ q ]
            return self.UF2rank [ p ]
        def find_6 ( self , q ) :
            self.UF2rank [ p ] = self.UF2rank [ q ]
            return self.UF2rank [ p ]
    return Main
