def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.j = True
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        s = sys.stdin.read ( )
        str_list = s.split ( '' )
        if len ( str_list ) != a + b + 1 :
            self.j = False
        if str_list [ a ] == '-' :
            for i in str_list :
                if i != a :
                    if not ( i in string.digits ) :
                        x = int ( i )
                        if x >= 10 and x < 0 :
                            self.j = False
                    else :
                        self.j = False
        else :
            self.j = False
        if self.j :
            print ( 'Yes' )
        elif not self.j :
            print ( 'No' )
