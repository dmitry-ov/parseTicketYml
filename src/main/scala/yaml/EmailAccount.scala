package yaml

import scala.beans.BeanProperty

/**
  * With the Snakeyaml Constructor approach shown in the main method,
  * this class must have a no-args constructor.
  */
class EmailAccount {
  @BeanProperty var accountName = ""
  @BeanProperty var username = ""
  @BeanProperty var password = ""
  @BeanProperty var mailbox = ""
  @BeanProperty var imapServerUrl = ""
  @BeanProperty var protocol = ""
  @BeanProperty var minutesBetweenChecks = 0
  @BeanProperty var usersOfInterest = new java.util.ArrayList[String]()

  override def toString: String = s"acct: $accountName, user: $username, url: $imapServerUrl"
}