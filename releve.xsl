<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Releve Bancaire</title>
            </head>
            <body>
                <h3>Releve de operations bancaires</h3>
                <xsl:for-each select="/releve">
                    <ul>
                        <li>RIB         : <xsl:value-of select="@rib"/></li>
                        <li>Date releve : <xsl:value-of select="dateReleve"/>  </li>
                        <li>Solde       : <xsl:value-of select="solde"/>  </li>
                    </ul>
                    <h3> Details des operation bancaires</h3>
                    <xsl:for-each select="operations">
                         Extrarit du compte Du : <xsl:value-of select="@dateDebut"/> A <xsl:value-of select="@dateFin"/>
                        <table border="1" width="50%">
                            <tr>
                                <th>Date</th> <th>Description</th> <th>Debit</th> <th>Credit</th>
                            </tr>
                            <xsl:for-each select="operation">
                                <tr>
                                    <td><xsl:value-of select="@date"/></td>
                                    <td><xsl:value-of select="@description"/></td>
                                    <td>
                                        <xsl:if test="@type='DEBIT'">
                                            <xsl:value-of select="@montant"/>
                                        </xsl:if>
                                    </td>
                                    <td>
                                        <xsl:if test="@type='CREDIT'">
                                        <xsl:value-of select="@montant"/>
                                        </xsl:if>
                                    </td>
                                </tr>
                            </xsl:for-each>
                            <tr>
                                <td colspan="2">Total</td>
                                <td>
                                    <xsl:value-of select="sum(operations/operation[@type='DEBIT']/@montant)"/>
                                </td>
                                <td>
                                    <xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant)"/>
                                </td>
                            </tr>
                        </table>
                    </xsl:for-each>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>