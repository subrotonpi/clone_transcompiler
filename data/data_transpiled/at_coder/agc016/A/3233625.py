def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.map = [ ]
        self.label = [ ]
        self.M = 0
        self.N = 0
        self.T = 0
        self.P = 0
        self.MOD = 1000000007
    def main ( ) :
        with open ( "/proc/" , "r" ) as f :
            s = f.read ( )
    ans = 9999
    for i in range ( 26 ) :
        ss = s
        temps = ""
        cnt = 0
        while True :
            ok = 0
            for j in ss :
                if j != "a" + i :
                    break
                ok += 1
            if ok == len ( ss ) :
                break
            cnt += 1
            for j in ss [ : - 1 ] :
                if j == "a" + i or j + 1 == "a" + i :
                    temps = temps + chr ( ord ( "a" + i ) )
                else :
                    temps = temps + '0'
            ss = temps
            temps = ""
        ans = min ( ans , cnt )
    print ( ans )
