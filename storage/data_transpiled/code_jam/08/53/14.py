def _ _ main _ _ ( ) : return
import os
import locale
import sys
import os
import math
import os
import os
import locale
import os
import locale
import os
import locale
import time
import time
import time
import time
import subprocess
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        self.stdin = open ( self.inp_file , 'r' )
        self.st = subprocess.Popen ( self.stdin , stdout = subprocess.PIPE , stderr = subprocess.STDOUT )
        self.stdout = open ( self.out_file , 'w' )
        subprocess.Popen ( self.stdout , stdout = subprocess.PIPE , stderr = subprocess.STDOUT ).communicate ( )
        self.stdout.close ( )
    def taskid ( self ) :
        self.stdout.write ( 'Case #%d: ' % self.taskid ( self.t ) )
        self.stdout.write ( self.comp ( ) )
    def run ( self ) :
        T = int ( self.stdout.readline ( ).strip ( ) )
        for t in range ( 1 , T + 1 ) :
            self.stdout.write ( '%s\n' % t )
    def run ( self ) :
        for t in range ( 1 , T + 1 ) :
            self.stdout.write ( '%s\n' % t )
    def run ( self ) :
        try :
            self.stdout.readline ( )
        except Exception :
            pass
    def ni ( self ) :
        self.stdout.write ( '%d: ' % int ( self.nval ) )
    def nl ( self ) :
        self.stdout.write ( '%d: ' % long ( self.nval ) )
    def ns ( self ) :
        self.stdout.write ( '%s\n' % ns ( self.sval ) )
    def nd ( self ) :
        self.stdout.write ( '%d: ' % nd ( self.nval ) )
    def nline ( self ) :
        try :
            return self.stdout.readline ( )
        except Exception :
        