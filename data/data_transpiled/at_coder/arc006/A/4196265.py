def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.e_set = set ( [ self.e ] )
    b = sys.stdin.read ( )
    count = 0
    bonus = False
    for i in range ( 6 ) :
        x = sys.stdin.read ( )
        if x in self.e_set :
            count += 1
        elif x == b :
            bonus = True
    ans = 0
    if count == 6 :
        ans = 1
    elif count == 5 :
        if bonus :
            ans = 2
        else :
            ans = 3
    elif count == 4 :
        ans = 4
    elif count == 3 :
        ans = 5
    print ( ans )
