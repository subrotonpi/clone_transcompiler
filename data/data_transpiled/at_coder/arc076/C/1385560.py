def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            R = sc.read ( )
            C = sc.read ( )
            N = sc.read ( )
        def __init__ ( self ) :
            self.alist = [ ]
            self.blist = [ ]
            self.clist = [ ]
            self.dlist = [ ]
            for v in self.alist :
                if v.id == 0 :
                    self.st.append ( v.id )
                    self.count [ v.id ] += 1
                else :
                    p = self.st.pop ( )
                    if v.id != p :
                        ans = "NO"
                        break
        for v in self.dlist :
            if v.id == 0 :
                self.st.append ( v.id )
                self.count [ v.id ] += 1
            else :
                p = self.st.pop ( )
                if v.id != p :
                    ans = "NO"
                    break
    for v in self.alist :
        if v.id == 0 :
            self.st.append ( v.id )
            self.count [ v.id ] += 1
        else :
            p = self.st.pop ( )
            if v.id != p :
                ans = "NO"
                break
    for v in self.blist :
        if v.id == 0 :
            self.st.append ( v.id )
            self.count [ v.id ] += 1
        else :
            p = self.st.pop ( )
            if v.id != p :
                ans = "NO"
                break
    for v in self.dlist :
        if v.id == 0 :
            self.st.append ( v.id )
            self.count [ v.id ] += 1
        else :
            p = self.st.pop ( )
            self.count [ v.id ] = 1
    return Main ( )
