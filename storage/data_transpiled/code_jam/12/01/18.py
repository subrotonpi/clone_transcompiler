def SPACETOKEN com.google.codejam2012.qualification ; import java.io.BufferedReader , java.io.InputStreamReader , java.lang.String
class SpeakingInTongues :
    TRANSLATER = "yhesocvxduiglbkrztnwjpfmaq"
    def translate ( self , ch ) :
        if 'a' <= ch <= 'z' : return TRANSLATER [ ch - 'a' ]
        else : return ch
    def translate ( self , s ) :
        l = len ( s )
        translated = [ translate ( ch ) for ch in s ]
        return "".join ( translated )
    def main ( self ) :
        try :
            f = java.lang.Runtime.open ( "/proc/self/cmdline" , 64 << 10 )
            tests_number = int ( f.read ( ).strip ( ) )
            for test in range ( 1 , tests_number + 1 ) :
                print ( "Case #%d:%s" % ( test , translate ( f.read ( ) ) ) )
        except Exception as e :
            print ( "Error:" , e )
